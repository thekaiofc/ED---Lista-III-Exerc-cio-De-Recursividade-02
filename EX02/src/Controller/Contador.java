package Controller;

public class Contador {

    // Construtor
    public Contador() {
        super();
    }

    public int contarOcorrencias(int numero, int digito) {

        /*
         * Quando o número for igual a 0,
         * significa que todos os dígitos já foram verificados.
         */
        if (numero == 0) {
            return 0;
        }

        /*
         * Verifica se o último dígito
         * é igual ao dígito procurado.
         * Soma 1 caso seja igual.
         * Depois chama a função para (numero / 10),
         * removendo o último dígito.
         */
        int ultimoDigito = numero % 10;

        if (ultimoDigito == digito) {
            return 1 + contarOcorrencias(numero / 10, digito);
        } else {
            return contarOcorrencias(numero / 10, digito);
        }
    }
}