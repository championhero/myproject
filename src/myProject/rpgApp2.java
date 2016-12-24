/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package myProject;

/**
 *
 * @author Yao
 */
public class rpgApp2 {

    public static void main(String[] args) {
        DAOrpg data = new DAOrpg();
        data.create(new rpg(1, 1, 0, 10.0, 10.0, 100.0, "main character"));
        data.create(new rpg(2, 1, 0, 2.0, 2.0, 100.0, "minionOne"));
        data.create(new rpg(3, 1, 0, 2.0, 2.0, 100.0, "minionTwo"));
        data.create(new rpg(4, 1, 0, 2.0, 2.0, 100.0, "minionThree"));

        System.out.println(data);

        System.out.println(data.retrieve(2));
        System.out.println(data.retrieve(-1));

        rpg r1 = new rpg(2, 1, 0, 10.0, 10.0, 100.0, "main character two");
        data.update(r1);
        System.out.println(data.retrieve(2));

        data.delete(4);
        System.out.println(data);
    }
}
