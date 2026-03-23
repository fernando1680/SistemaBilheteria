import java.util.Scanner;

public class sistemaBilhoteria {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[][] cinema = new String[5][3];

        for (int i = 0; i < 5; i++) {
            System.out.println("\n---- Poltrona especial " + (i + 1) + " ----");
            System.out.print("Nome: ");
            cinema[i][0] = sc.nextLine();

            System.out.print("Idade: ");
            cinema[i][1] = sc.nextLine();

            System.out.print("Tipo (inteira/meia): ");
            cinema[i][2] = sc.nextLine();
        }

        double faturamentoTotal = 0;
        int totalInteiras = 0;
        int totalMeias = 0;

        System.out.println("\n--- Status e Processamento ---");
        for (int i = 0; i < 5; i++) {
            String nome = cinema[i][0];
            String tipoEntrada = cinema[i][2];

            if (!nome.trim().isEmpty()) {
                System.out.println("Poltrona " + (i + 1) + ": [OCUPADA] - " + nome);
                
                if (tipoEntrada.equalsIgnoreCase("inteira")) {
                    faturamentoTotal += 40.0; 
                    totalInteiras++;          
                } else {
                    faturamentoTotal += 20.0; 
                    totalMeias++;             

                }
            } else {
                System.out.println("Poltrona " + (i + 1) + ": [VAZIA]");
            }
        }

        System.out.println("\n--- Resumo Financeiro ---");
        System.out.println("Quantidade de Inteiras: " + totalInteiras);
        System.out.println("Quantidade de Meias: " + totalMeias);
        System.out.println("Faturamento Total: R$ " + faturamentoTotal);

        System.out.println("Pesquise sobre alguma poltrona de 1 a 5");
        String Busca = sc.nextLine();

        if(!Busca.trim().isEmpty()){
            int IndiceBusca = Integer.parseInt(Busca) -1;

            if(IndiceBusca >= 0 && IndiceBusca < 5){
                String nomeOcupante = cinema[IndiceBusca][0];
                String idadeOcupante = cinema[IndiceBusca][1];

                if(nomeOcupante == null || nomeOcupante.trim().isEmpty()){
                    System.out.println("a poltrona "+Busca+" está dísonivel");
                }
                else{
                    System.out.println("A poltrona "+Busca+" está ocupado por "+nomeOcupante);
                    System.out.println("a idade do ocupante é: "+idadeOcupante);
                }

            }else{
                System.err.println("O número digitado é maior que o pedido!!");
            }
        }
        


        sc.close();
    }
}
