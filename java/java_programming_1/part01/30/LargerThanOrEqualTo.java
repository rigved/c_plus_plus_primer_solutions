/*
 * LargerThanOrEqualTo.java
 * Copyright (C) 2020  Rigved Rakshit
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Affero General Public License as published
 * by the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU Affero General Public License for more details.
 *
 * You should have received a copy of the GNU Affero General Public License
 * along with this program. If not, see <https://www.gnu.org/licenses/>.
 */


import java.util.Scanner;

public class LargerThanOrEqualTo
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);

        System.out.println("Give the first number:");
        int firstNumber = Integer.valueOf(scan.nextLine());
        System.out.println("Give the second number:");
        int secondNumber = Integer.valueOf(scan.nextLine());

        if (firstNumber > secondNumber)
        {
            System.out.println("Greater number is: " + firstNumber);
        }
        else if (secondNumber > firstNumber)
        {
            System.out.println("Greater number is: " + secondNumber);
        }
        else
        {
            System.out.println("The numbers are equal!");
        }

        scan.close();
    }
}
