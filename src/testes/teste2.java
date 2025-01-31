package testes;

public class teste2 {
   public static void main(String[] args) {
      int[] nums = new int[10];

      for (int i = 0; i < nums.length; i++) {
         nums[i] = (int) (Math.random() * nums.length);
      }

      System.out.println();
      for (int i : nums) {
         System.out.print(i + " ");
      }
      System.out.println();

      // Ordenando Booble Sort

      int aux;
      for (int i = 0; i < nums.length; i++) {
         for (int j = i + 1; j < nums.length; j++) {
            if (nums[i] > nums[j]) {
               aux = nums[j];
               nums[j] = nums[i];
               nums[i] = aux;
            }
         }
      }

      System.out.println("Ordenado com o BoobleSort");
      for (int i : nums) {
         System.out.print(i + " ");
      }
      System.out.println();

      // System.out.println("Busca Binaria");
      boolean isNum = false;
      int target = 5;
      int start = 0;
      int end = nums.length - 1;
      int mid;

      while (start <= end) {
         mid = (start + end) / 2;
         if (nums[mid] == target) {
            isNum = true;
            break;
         } else if (nums[mid] < target) {
            start = mid + 1;
         } else {
            end = mid - 1;
         }
      }

      System.out.println(isNum ? "Achamos o Seu numero" : "Numero não encontrado!");
   }
}
