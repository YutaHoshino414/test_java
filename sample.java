class sample {
  public static void main(String[] args) {
      int num;
      num = 3;
      System.out.println("変数numの値は" + num + "です");

      num = 5;
      System.out.println("変数numの値を更新しました");
      System.out.println("変数numの値は" + num + "です");
      System.out.println("-----------------------------");

     // final付き宣言により書き換えできない(定数)
      final double tax = 1.08;
      int fax = 5;
      System.out.println("5万円から4万円に値下げします");
      // tax = 4;
      System.out.println("Faxの新価格(税込み)");
      System.out.println(fax * tax + "万円");
      System.out.println("-----------------------------");

      int a;
      a = 100;
      a++;
      System.out.println(a);
  }
}