
# App Lock

App Lock is a secure Java-based desktop application that provides user authentication with email OTP verification along with advanced file-hiding capabilities. With App Lock, users can securely hide and later retrieve any desktop files, ensuring their sensitive data remains protected.

## Table of Contents

- [Features](#features)
- [Installation](#installation)
- [Usage](#usage)
- [Technologies Used](#technologies-used)
- [License](#license)

## Features

- **User Authentication:**  
  - Secure login and signup system.
  - Email-based OTP (One-Time Password) verification for extra security during the authentication process.

- **File Hiding and Retrieval:**  
  - Easily hide any desktop file securely.
  - Retrieve hidden files when needed.

- **User-Friendly Interface:**  
  - Simple terminal based application.
  
- **Cross-Platform Support:**  
  - Designed to work on various operating systems with Java support.

## Installation

### Prerequisites

- **Java Development Kit (JDK):**  
  Ensure you have JDK 17 (or higher, as required) installed on your system.

- **Maven:**  
  The project uses Maven for dependency management. Install Maven if it is not already installed.

### Steps

1. **Clone the Repository:**  
   Open a terminal and run:
   ```sh
   git clone https://github.com/psudocode-monk/App-Lock.git
   ```
2. **Navigate to the Project Directory:**  
   ```sh
   cd App-Lock
   ```
3. **Build the Project with Maven:**  
   ```sh
   mvn clean install
   ```
4. **Run the Application:**  
   You can run the application using your IDE or via the command line:
   ```sh
   java -jar target/App-Lock-1.0-SNAPSHOT.jar
   ```

## Usage

1. **Signup/Login:**  
   - Launch the application.
   - For new users, register by providing the necessary details.
   - Existing users can log in using their credentials.
   
2. **Email OTP Verification:**  
   - Upon signup or login, an OTP is sent to the registered email address.
   - Enter the OTP to verify your identity and complete the authentication process.

3. **File Hiding:**  
   - Navigate to the file hiding section.
   - Select the desktop file you wish to hide.
   - The file is securely encrypted and removed from its original location.

4. **File Retrieval:**  
   - Go to the file retrieval section.
   - Select the hidden file to bring it back to its original location.
   
## Demo

A demo video is included with this project to showcase its features and workflow. Please refer to the attached demo video (`App_Lock_Demo.mp4`) for a step-by-step demonstration of the application's functionality.

## Technologies Used

- **Java:** Core programming language.
- **Maven:** Dependency management and build automation.
- **MySQL:** (If applicable) for storing user data and file metadata.
- **JavaMail API:** For sending email OTPs.
- **Swing/JavaFX:** (If applicable) for building the graphical user interface.

## License

This project is licensed under the [MIT License](LICENSE).

```
Feel free to modify the content and sections to best suit your project details.
