/*
 * RepeatingBreakingAndRemembering.java
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

public class RepeatingBreakingAndRemembering
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        int sum = 0, count = 0, countEven = 0, countOdd = 0;

        System.out.println("Give numbers:");

        while (true)
        {
            int number = Integer.valueOf(scanner.nextLine());

            if (number == -1)
            {
                break;
            }

            sum += number;
            count++;

            if (number % 2 == 0)
            {
                countEven++;
            }
            else
            {
                countOdd++;
            }
        }

        System.out.println("Thx! Bye!");
        System.out.println("Sum: " + sum);
        System.out.println("Numbers: " + count);
        System.out.println("Average: " + ((sum * 1.0) / count));
        System.out.println("Even: " + countEven);
        System.out.println("Odd: " + countOdd);

        scanner.close();
    }
}
