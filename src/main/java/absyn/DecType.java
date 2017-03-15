package absyn;

import javaslang.collection.Tree;
import parse.Loc;

/**
 * Created by aluno on 15/03/2017.
 */
public class DecType extends AST {

    public final String name;
    public final Ty ty;

    public DecType(Loc loc, String name, Ty ty){
        super(loc);
        this.name = name;
        this.ty = ty;
    }

    public Tree.Node<String> toTree(){
        return Tree.of("DecType", Tree.of(name), ty.toTree());
    }
}
