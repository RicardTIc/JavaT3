class ManipulaArray {

    int[] array;

    public ManipulaArray(int tamanho) {
        this.array = new int[tamanho];
    }

    // Cria um array de números inteiros lidos do usuário
    public void criaArrayUsuario() {
        System.out.println("Digite os numeros do array:");
        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(System.console().readLine());
        }
    }

    // Cria um array de números inteiros aleatórios
    public void criaArrayAleatorio() {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 100);
        }
    }

    // Calcula a soma de todos os elementos no array
    public int somaArray() {
        int soma = 0;
        for (int i = 0; i < array.length; i++) {
            soma += array[i];
        }
        return soma;
    }

    // Encontra o maior valor do array
    public int maiorArray() {
        int maior = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > maior) {
                maior = array[i];
            }
        }
        return maior;
    }

    // Encontra o menor valor do array
    public int menorArray() {
        int menor = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < menor) {
                menor = array[i];
            }
        }
        return menor;
    }
}

public class teste3 {

    public static void main(String[] args) {
        ManipulaArray array = new ManipulaArray(5);

        // Cria um array de números inteiros lidos do usuário
        array.criaArrayUsuario();

        // Imprime o array
        System.out.println("Array:");
        for (int i = 0; i < array.array.length; i++) {
            System.out.println(array.array[i]);
        }

        // Calcula a soma do array
        int soma = array.somaArray();
        System.out.println("Soma: " + soma);

        // Encontra o maior valor do array
        int maior = array.maiorArray();
        System.out.println("Maior: " + maior);

        // Encontra o menor valor do array
        int menor = array.menorArray();
        System.out.println("Menor: " + menor);

        // Cria um array de números inteiros aleatórios
        array.criaArrayAleatorio();

        // Imprime o array
        System.out.println("Array aleatorio:");
        for (int i = 0; i < array.array.length; i++) {
            System.out.println(array.array[i]);
        }
    }
}
