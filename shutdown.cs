using System.Diagnostics;

class Program {
    static void Main() {
        string os = System.Environment.OSVersion.Platform.ToString();

        if(os.StartsWith("Win")) {
            Process.Start("shutdown", "/s /t 1");
        }
        else if(os == "unix") {
            Process.Start("shutdown", "now");
        }
    }
}