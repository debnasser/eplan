package absyn;

import env.Env;
import parse.Loc;

/**
 * Created by aluno on 15/03/2017.
 */
public abstract class Ty extends AST {

    public Ty(Loc loc) {
        super(loc);
    }

    public abstract void semantic(Env env);
}
