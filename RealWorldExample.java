import java.util.HashMap;
import java.util.Map;

// Let me show you EXACTLY what happens in memory

class ProxyFileDownloader {
    private Map<String, String> cache = new HashMap<>(); // This lives with the OBJECT

    public ProxyFileDownloader() {
        System.out.println("🏗️  Proxy object created - cache initialized");
    }

    public String downloadFile(String filename) {
        System.out.println("📞 Method called on SAME object instance");

        if (cache.containsKey(filename)) {
            System.out.println("✅ Found in cache! (cache size: " + cache.size() + ")");
            return cache.get(filename);
        }

        System.out.println("⬇️  Downloading from server...");
        String content = "Content of " + filename;
        cache.put(filename, content);
        System.out.println("💾 Stored in cache (cache size now: " + cache.size() + ")");

        return content;
    }

    public void showCacheInfo() {
        System.out.println("🗂️  Cache contents: " + cache.keySet() + " (size: " + cache.size() + ")");
        System.out.println("🏠 Object memory address: " + this.hashCode());
    }
}

// SCENARIO 1: ✅ CORRECT - Same object instance
class CorrectUsage {
    public static void main(String[] args) {
        System.out.println("=== CORRECT WAY - Same Object Instance ===");

        // Create ONE object instance
        ProxyFileDownloader downloader = new ProxyFileDownloader();

        System.out.println("\n--- First call ---");
        downloader.downloadFile("file1.txt");
        downloader.showCacheInfo();

        System.out.println("\n--- Second call (same object) ---");
        downloader.downloadFile("file1.txt"); // Should hit cache!
        downloader.showCacheInfo();

        System.out.println("\n--- Third call (new file) ---");
        downloader.downloadFile("file2.txt");
        downloader.showCacheInfo();
    }
}

// SCENARIO 2: ❌ WRONG - New object each time
class WrongUsage {
    public static void main(String[] args) {
        System.out.println("=== WRONG WAY - New Object Each Time ===");

        System.out.println("\n--- First call ---");
        ProxyFileDownloader downloader1 = new ProxyFileDownloader(); // New object
        downloader1.downloadFile("file1.txt");
        downloader1.showCacheInfo();

        System.out.println("\n--- Second call (NEW OBJECT!) ---");
        ProxyFileDownloader downloader2 = new ProxyFileDownloader(); // Another new object!
        downloader2.downloadFile("file1.txt"); // Cache is empty in this new object!
        downloader2.showCacheInfo();
    }
}

// SCENARIO 3: 🤔 METHOD-LEVEL vs INSTANCE-LEVEL
class UnderstandingScope {

    // ❌ This would NOT work - method-level variable
    public String badCachingExample(String filename) {
        Map<String, String> cache = new HashMap<>(); // New every method call!

        if (cache.containsKey(filename)) { // Always false!
            return cache.get(filename);
        }

        String content = "Content of " + filename;
        cache.put(filename, content);
        return content; // Cache dies when method ends
    }

    // ✅ This WORKS - instance-level variable
    private Map<String, String> cache = new HashMap<>(); // Lives with object

    public String goodCachingExample(String filename) {
        if (cache.containsKey(filename)) { // Can find previous entries!
            return cache.get(filename);
        }

        String content = "Content of " + filename;
        cache.put(filename, content);
        return content; // Cache survives method end
    }
}

// REAL-WORLD EXAMPLE: How it's typically used
class RealWorldExample {
    public static void main(String[] args) {
        System.out.println("=== REAL WORLD USAGE ===");

        // Usually you create the proxy once and reuse it
        ProxyFileDownloader fileService = new ProxyFileDownloader();

        // Throughout your application lifetime, you call methods on SAME object
        processUserRequest(fileService, "document.pdf");
        processUserRequest(fileService, "image.jpg");
        processUserRequest(fileService, "document.pdf"); // Cache hit!

        System.out.println("\nFinal cache state:");
        fileService.showCacheInfo();
    }

    static void processUserRequest(ProxyFileDownloader service, String filename) {
        System.out.println("\n👤 User requested: " + filename);
        String content = service.downloadFile(filename);
        System.out.println("📄 Delivered: " + content.substring(0, Math.min(20, content.length())) + "...");
    }
}

/*
OUTPUT EXPLANATION:

CORRECT WAY:
🏗️  Proxy object created - cache initialized
--- First call ---
📞 Method called on SAME object instance
⬇️  Downloading from server...
💾 Stored in cache (cache size now: 1)
🗂️  Cache contents: [file1.txt] (size: 1)
--- Second call (same object) ---
📞 Method called on SAME object instance  
✅ Found in cache! (cache size: 1)        <- CACHE HIT!

WRONG WAY:
🏗️  Proxy object created - cache initialized
⬇️  Downloading from server...
🏗️  Proxy object created - cache initialized  <- NEW OBJECT!
⬇️  Downloading from server...                <- CACHE MISS (empty cache)
*/