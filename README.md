# Reactive-Programming-Masterclass

## Java and Maven Installation Guide

## Installing Java

1. **Check if Java is Already Installed:**
   To determine if Java is already installed on your system, open a terminal or command prompt and run the following command:

```
java -version
```

If you see a Java version displayed, it means Java is already installed. You can skip to the Maven installation section.

2. **Install Java:**
   If Java is not installed, you can download and install it from the official Oracle website or use OpenJDK, which is an open-source alternative.

- **Oracle Java (Note: Requires Oracle account):**
  Visit the [Oracle Java Downloads](https://www.oracle.com/java/technologies/javase-downloads.html) page and download the Java SE Development Kit (JDK) for your operating system. Follow the installation instructions for your platform.

- **OpenJDK (Linux/macOS):**
  On Linux and macOS, you can install OpenJDK using package managers like `apt` (for Debian/Ubuntu) or `brew` (for macOS).

  For Debian/Ubuntu:
  ```
  sudo apt update
  sudo apt install openjdk-11-jdk
  ```

  For macOS (using Homebrew):
  ```
  brew tap AdoptOpenJDK/openjdk
  brew install adoptopenjdk11
  ```

- **OpenJDK (Windows):**
  You can download OpenJDK for Windows from the [AdoptOpenJDK](https://adoptopenjdk.net/) website and follow the installation instructions.

3. **Verify Java Installation:**
   To verify that Java has been successfully installed, run the following command again:

```
java -version
```

## Installing Maven

1. **Download Maven:**
   Visit the [Apache Maven Download](https://maven.apache.org/download.cgi) page and download the latest stable version of Apache Maven. Choose the binary zip archive for your operating system.

2. **Install Maven:**
- Extract the downloaded zip archive to a location on your system.
- Add the `bin` directory of the extracted Maven folder to your system's PATH environment variable. This allows you to run Maven from any directory in your terminal.

3. **Verify Maven Installation:**
   Open a new terminal window and run the following command to verify that Maven has been successfully installed:

```
mvn -version
```

You should see Maven version information.


## Build
```bash
$ mvn clean install
```