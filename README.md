# Computer Shutdown Script

This repository contains code snippets in various programming languages to programmatically shutdown computer. Please use these scripts responsibly and ensure that you have the necessary permissions to perform a shutdown operation.

## Table of contents

- [Python](#python)
- [C++](#c)
- [CSharp](#csharp)
- [Java](#java)
- [Bash](#bash)
- [PowerShell](#powershell)
- [Usage](#usage)
- [Note](#note)
- [License](#license)

## Python

For Windows

```bash
import os
os.system("shutdown /s /t 1")
```

For Linux or macOS

```bash
import os
os.system("shutdown now")
```

These scripts use the `os` module to shutdown a computer. It works on both Windows and Unix-based systems.

## C++

```bash
#include<stdio.h>
#include<stdlib.h>
int main() {
    system("c:\\windows\\system32\\shutdown /s");
    return 0;
}
```

This script uses the `system` function to shutdown a computer.

## CSharp

```bash
using System.Diagnostics;

class Program
{
    static void Main()
    {
        string os = System.Environment.OSVersion.Platform.ToString();

        if (os.StartsWith("Win"))
        {
            Process.Start("shutdown", "/s /t 1");
        }
        else if (os == "Unix")
        {
            Process.Start("shutdown", "now");
        }
    }
}
```

This C# program determines the operating system and triggers a shutdown using `Process.Start()`.

# Java

```bash
import java.io.IOException;

public class ShutdownComputer {
    public static void main(String[] args) throws IOException {
        String os = System.getProperty("os.name").toLowerCase();

        if (os.contains("win")) {
            Runtime.getRuntime().exec("shutdown /s /t 1");
        } else if (os.contains("nix") || os.contains("nux") || os.contains("mac")) {
            Runtime.getRuntime().exec("shutdown now");
        }
    }
}
```

This Java program detects the operating system and executes the appropriate shutdown command using `Runtime.getRuntime().exec()`.

## Bash

Bash is used for Linux/macOS.

To shutdown immediately

```bash
sudo shutdown now
```

To shutdown after a delay (eg., 1 minute)

```bash
sudo shutdown -h +1
```

These Bash scripts use the `shutdown` command to shutdown the computer either immediately or after a specified delay.

## PowerShell

PowerShell is used for Windows.

To shutdown immediately

```bash
Stop-Computer
```

To shutdown after a delay (eg., 1 minute)

```bash
Stop-Computer -Force -Timeout 60
```

These PowerShell scripts use the `Stop-Computer` command to shutdown the computer either immediately or after a specified delay.

## Usage

Choose the script corresponding to your preferred programming language or operating system. Execute the script in a responsible manner, ensuring that you have the necessary permissions.

## Note

These scripts may require elevated privileges, and misuse can lead to data loss or other issues. Use them at your own risk.

Feel free to customize the README according to your specific needs or provide additional information as necessary.

Enjoy Computer Shutdown scripts!

## License

[MIT LICENSE](#LICENSE)
