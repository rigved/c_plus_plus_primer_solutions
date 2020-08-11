/*
 * TodoList.java
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


import java.util.ArrayList;

public class TodoList
{
    private ArrayList<String> todoList;

    public TodoList()
    {
        todoList = new ArrayList<>();
    }

    public void add(String task)
    {
        this.todoList.add(task);
    }

    public void print()
    {
        for (int i = 0; i < this.todoList.size(); i++)
        {
            System.out.println((i + 1) + ": " + this.todoList.get(i));
        }
    }

    public void remove(int number)
    {
        this.todoList.remove(number - 1);
    }
}
