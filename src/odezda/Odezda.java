/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package odezda;

import entity.Pants;
import entity.Tishka;
import entity.User;
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
        List<User> username = new ArrayList<>();
        int n =0;
        while(n==0){
        Scanner scan = new Scanner(System.in);
        System.out.print("\nВыберите пункт меню: "
                + "\n1. Добавить пользователя."
                + "\n2. Добавить тишку."
                + "\n3. Добавить штанцы."
                + "\n4. Вывод."
                + "\n5. Покупка."
                + "\n6. Выход."
                 );
        int vibor = scan.nextInt(); scan.nextLine();
        switch(vibor){
            case 1:
                User user = new User();
                System.out.print("Имя: ");
                String nameName = scan.nextLine();
                System.out.print("Фамилия: ");
                String nameSurname = scan.nextLine();
                System.out.print("Номер телефона: ");
                String namePhone = scan.nextLine();
                System.out.print("Баланс: ");
                int nameBalance = scan.nextInt(); scan.nextLine();
                user.setName(nameName);
                user.setSurname(nameSurname);
                user.setPhone(namePhone);
                user.setBalance(nameBalance);
                System.out.printf("Вы добавили пользователя - %s %s, с номером телефона - %s, с балансом %d.\n",
                    user.getName(),
                    user.getSurname(),
                    user.getPhone(),
                    user.getBalance()); 
                username.add(user);
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
                    System.out.printf("%d. %s %s, size: %d, price: %s\n", 
                    i+1,
                    shmot.get(i).getFirm(), 
                    shmot.get(i).getColor(),
                    shmot.get(i).getSize(),
                    shmot.get(i).getPrice()
                            );
                }
                if (vivod == 2) {
                    System.out.println("\n"+shmot);
                }
                else;
                System.out.println("\n"+shmot1);
                }
            case 5:
                System.out.print("1.Тишка."
                        + "2.Штаны."
                        + "Выберите что хотите купить: ");
                int choice = scan.nextInt();
                if (choice == 1) {
                    System.out.println("В наличии есть:");
                  System.out.println("1.Да "
                            + "2.Нет "
                            + "Будете совершать покупку?");
                }
                if (choice == 2) {
                    System.out.println("В наличии есть"+shmot1);
                    System.out.println("1.Да "
                            + "2.Нет "
                            + "Будете совершать покупку?");
                }
                
            case 6:
                n++;
                System.out.println("ВЫХОД");
                break;
        }
    }}
}


                 
        
        
        
                
        
    
    

