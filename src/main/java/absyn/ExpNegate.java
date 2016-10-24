package absyn;

import javaslang.collection.Tree;
import parse.Loc;

import static org.bytedeco.javacpp.LLVM.*;

public class ExpNegate extends Exp {

   public final Exp arg;

   public ExpNegate(Loc loc, Exp arg) {
      super(loc);
      this.arg = arg;
   }

   @Override
   public LLVMValueRef codegen(LLVMModuleRef module, LLVMBuilderRef builder) {
      final LLVMValueRef v_arg = arg.codegen(module, builder);
      return LLVMBuildFNeg(builder, v_arg, "negtmp");
   }

   @Override
   public Tree.Node<String> toTree() {
      return Tree.of("ExpNegate", arg.toTree());
   }
}