package absyn;

import env.Env;
import javaslang.collection.Tree;
import parse.Loc;
/**
 * Created by aluno on 15/03/2017.
 */
public class TyName extends Ty {

    public final String name;

    public TyName(Loc loc, String name){
        super(loc);
        this.name = name;
    }

    public void semantic (Env env){

    }

    public Tree.Node<String> toTree(){
        return Tree.of("TyName: " + name);
    }
}
