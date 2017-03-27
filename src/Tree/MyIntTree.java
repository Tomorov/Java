package Tree;

import java.util.ArrayList;

import static java.lang.System.out;

/**
 * Created by Anonimus on 23/03/2017.
 */
public class MyIntTree implements IntTree {

    public int value;
    public ArrayList<IntTree> child = new ArrayList<>();

    MyIntTree(int n){
        this.value = n;
    }

    @Override
    public int getValue() {
        return value;
    }

    @Override
    public int childrenNumber() {
        return child.size();
    }

    @Override
    public int nodes() {
        int contatore = 1;
        for (IntTree tree : child )
            contatore += tree.nodes();
        return contatore;
    }

    @Override
    public int height() {
        int height = 0;
        for (IntTree tree : child){
            height = Math.max(height, tree.height()+1);
        }
        return height;
    }

    @Override
    public boolean equals(IntTree t) {
        return false;
    }

    @Override
    public void addChild(IntTree child) {
        this.child.add(0, child);
    }

    @Override
    public IntTree followPath(int[] path) throws NoSuchTreeException {
        try{
            for (int k = 0; k < path.length; k++){
                child.get(path[k]).followPath()
            }

        }catch (IndexOutOfBoundsException out){

        }
    }

    public int[] reduce(int[] list){
        int[] reduce = new int[list.length-1];
        for (int i = 1; i < list.length-1; i++){

        }
    }

    @Override
    public void visit() {
        out.print(this.getValue() + " ");
        for (int i = 0; i < child.size(); i++){
            child.get(i).visit();
        }
    }

    @Override
    public void printIntTree() {

    }
    }

