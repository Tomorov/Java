package Tree;

import java.util.ArrayList;
import java.util.Objects;

import static java.lang.System.out;

/**
 * Created by Anonimus on 27/03/2017.
 */
public class TestTree {

    public static void main(String[]args){
        //altezza();
        arr();
    }


    public static void altezza() {
        MyIntTree a = new MyIntTree(30);
        a.addChild(new MyIntTree(100));
        a.addChild(new MyIntTree(40));
        MyIntTree b = new MyIntTree(0);
        for (int i = 1; i < 5; i++) {
            b.addChild(new MyIntTree(i));
        }
        a.addChild(b);
        a.visit();
    }

    public static void arr(){
        ArrayList<Integer> a = new ArrayList<Integer>(4);
        a.get(5);
    }
}
