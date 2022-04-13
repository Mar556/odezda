/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odezda;

import entity.Pants;
import entity.Tishka;
import entity.User1;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author mark-
 */
public class Odezda {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        List<Tishka> shmot = new ArrayList<>();
        List<Pants> shmot1 = new ArrayList<>();
        List<User1> username = new ArrayList<>();
        int n =0;
        while(n==0){
        Scanner scan = new Scanner(System.in);
        System.out.print("\n1. Добавить пользователя."
                + "\n2. Добавить тишку."
                + "\n3. Добавить штанцы."
                + "\n4. Вывод."
                + "\n5. Покупка."
                + "\n6. Выход."
                + "\nВыберите пункт меню: "
                 );
        int vibor = scan.nextInt(); scan.nextLine();
        switch(vibor){
            case 1:
                User1 user1 = new User1();
                System.out.print("Имя: ");
                String nameName = scan.nextLine();
                System.out.print("Фамилия: ");
                String nameSurname = scan.nextLine();
                System.out.print("Номер телефона: ");
                String namePhone = scan.nextLine();
                System.out.print("Баланс: ");
                int nameBalance = scan.nextInt(); scan.nextLine();
                user1.setName(nameName);
                user1.setSurname(nameSurname);
                user1.setPhone(namePhone);
                user1.setBalance(nameBalance);
                System.out.printf("Вы добавили пользователя - %s %s, с номером телефона - %s, с балансом %d.\n",
                    user1.getName(),
                    user1.getSurname(),
                    user1.getPhone(),
                    user1.getBalance()); 
                username.add(user1);
                break;  
            case 2:
                Tishka tishka = new Tishka();
                System.out.print("Фирма:  ");
                String nameFirm = scan.nextLine();
                System.out.print("Размер:   ");
                int nameSize = scan.nextInt(); scan.nextLine();
                System.out.print("Цвет:  ");
                String nameColor = scan.nextLine();
                System.out.print("Цена:  ");
                double namePrice = scan.nextDouble(); scan.nextLine();
                tishka.setFirm(nameFirm);
                tishka.setSize(nameSize);
                tishka.setColor(nameColor);
                tishka.setPrice(namePrice);
                System.out.printf("Вы добавили Тишку фирмы - %s, Размер -%d, Цвет -%s, Цена -%s",
                        tishka.getFirm(),
                        tishka.getSize(),
                        tishka.getColor(),
                        tishka.getPrice());
                shmot.add(tishka);
                break;
                
                
            case 3:
                Pants pants = new Pants();
                System.out.print("Фирма: ");
                String nameFirm2 = scan.nextLine();
                System.out.print("Цвет: ");
                String nameColor2 = scan.nextLine();
                System.out.print("Цена: ");
                double namePrice2 = scan.nextDouble(); scan.nextLine();
                System.out.print("Размер: ");
                double nameSize2 = scan.nextDouble(); scan.nextLine();
                pants.setFirm2(nameFirm2);
                pants.setColor2(nameColor2);
                pants.setPrice2(namePrice2);
                pants.setSize2(nameSize2);
                System.out.printf("Вы добавили штаны фирмы - %s, Цвета - %s, по цене - %s, размер - %s.",
                        pants.getFirm2(),
                        pants.getColor2(),
                        pants.getPrice2(),
                        pants.getSize2());
                shmot1.add(pants);
                break;
                
                        
            case 4:
                System.out.println("Выберите что вы хотите вывести:    ");
                int vivod = scan.nextInt();scan.nextLine();
                if (vivod == 1) {
                    
                    for (int i = 0; i < shmot.size(); i++) {
                    System.out.printf("В наличии есть: %d. %s %s, размер: %d, с ценой: %s\n", 
                    i+1,
                    shmot.get(i).getFirm(), 
                    shmot.get(i).getColor(),
                    shmot.get(i).getSize(),
                    shmot.get(i).getPrice()
                            );
                }
                if (vivod == 2) {
                                       
                    for (int i = 0; i < shmot1.size(); i++) {
                    System.out.printf("В наличии есть: %d. %s %s, размер: %d, с ценой: %s\n", 
                    i+1,
                    shmot1.get(i).getFirm2(), 
                    shmot1.get(i).getColor2(),
                    shmot1.get(i).getSize2(),
                    shmot1.get(i).getPrice2()
                            );
                }
                }
                
                }
                break;
            case 5:
                System.out.print("1.Тишка"
                        + "\n2.Штаны"
                        + "\nВыберите что хотите купить: ");
                int choice = scan.nextInt();
                switch (choice) {
                    case 1:
                    
                    for (int i = 0; i < shmot.size(); i++) {
                    System.out.printf("В наличии есть: %d. %s %s, размер: %d, с ценой: %s\n", 
                    i+1,
                    shmot.get(i).getFirm(), 
                    shmot.get(i).getColor(),
                    shmot.get(i).getSize(),
                    shmot.get(i).getPrice()
                            );
                 
                    System.out.println("1.Да "
                            + "\n2.Нет "
                            + "\nБудете совершать покупку?");
                }
                    break;
                    case 2:
                    
                                        for (int i = 0; i < shmot.size(); i++) {
                    System.out.printf("В наличии есть: %d. %s %s, размер: %s, с ценой: %s\n", 
                    i+1,
                    shmot1.get(i).getFirm2(), 
                    shmot1.get(i).getColor2(),
                    shmot1.get(i).getSize2(),
                    shmot1.get(i).getPrice2()
                            );
                    System.out.println("1.Да "
                            + "\n2.Нет "
                            + "\nБудете совершать покупку? ");
                    int pokupka = scan.nextInt();scan.nextLine();
                    if (pokupka == 1) {
                        
                            System.out.println(username);
                            System.out.println("Какой аккаунт ваш? ");
                            int acc = scan.nextInt();
                            if(acc == 1){
                                for (int b = 0; b < username.size(); b++)
                                    for (int c = 0; c < username.size(); c++ )
                                System.out.println(username.get(b));
                            }
                            
                            System.out.printf("У вас на балансе: %d.",
                                    username.get(0).getBalance());

                            
                    }    
                    
                }
                }
                
                break;
            case 6:
                n++;
                System.out.println("ВЫХОД");
                break;
        }
    }}
}


                 
        
        
        
                
        
    
    

