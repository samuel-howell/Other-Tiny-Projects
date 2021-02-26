class Problem {
    public static void main(String[] args) {
        int c = 0; //counter
        for(int i = 0; i < args.length; i++){
          if(args[i].equals("test")){
              System.out.println(c);
              System.exit(0);
          }
          c++;
        }
        System.out.println(-1);
    }
}