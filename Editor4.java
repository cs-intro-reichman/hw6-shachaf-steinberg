// Source code is decompiled from a .class file using FernFlower decompiler.
import java.awt.Color;

public class Editor4 {
   public Editor3() {
   }

   public static void main(String[] var0) {
      String var1 = var0[0];
      String var2 = var0[1];
      int var3 = Integer.parseInt(var0[2]);
      Color[][] var4 = Runigram.read(var1);
      Color[][] var5 = Runigram.read(var2);
      Runigram.setCanvas(var4);
      Runigram.morph(var4, var5, var3);
   }
}
