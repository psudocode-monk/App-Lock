package views;

import dao.UserDAO;
import model.User;
import service.GenerateOTP;
import service.SendOTPService;
import service.UserService;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.sql.SQLException;
import java.util.Scanner;

public class Welcome
{
    public void welcomeScreen()
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Welcome to App Lock");
        System.out.println("Press 1 to login");
        System.out.println("Press 2 to signup");
        System.out.println("Press 3 to exit");

        int choice = 0;

        try
        {
            choice = Integer.parseInt(br.readLine());
        }
        catch(IOException e)
        {
            e.printStackTrace();
        }
        switch(choice)
        {
            case 1 -> login();
            case 2 -> signUp();
            case 3 -> System.exit(0);
        }
    }

    private void signUp()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your name:");
        String name = sc.nextLine();
        System.out.println("Enter your e-mail:");
        String email = sc.nextLine();

        String genOTP = GenerateOTP.getOTP();
        SendOTPService.sendOTP(email, genOTP);
        System.out.println("Enter the OTP: ");
        String otp = sc.nextLine();

        if(otp.equals(genOTP))
        {
            User user = new User(name, email);
            int response = UserService.saveUser(user);
            switch(response)
            {
                case 0 -> System.out.println("User registered successfully");
                case 1 -> System.out.println("User already exists");
            }
        }
        else
        {
            System.out.println("Wrong OTP input");
        }
    }

    private void login()
    {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your registered e-mail: ");
        String email = sc.nextLine();
        try
        {
            if(UserDAO.isExist(email))
            {
                String genOTP = GenerateOTP.getOTP();
                SendOTPService.sendOTP(email, genOTP);
                System.out.println("Enter the OTP: ");
                String otp = sc.nextLine();
                if(otp.equals(genOTP))
                {
                    // System.out.println("Welcome");
                    new UserView(email).home();
                }
                else
                {
                    System.out.println("Wrong OTP input");
                }
            }
            else
            {
                System.out.println("User not found");
            }
        }
        catch (SQLException e)
        {
            e.printStackTrace();
        }
    }
}
