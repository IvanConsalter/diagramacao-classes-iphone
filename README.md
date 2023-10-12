# diagramacao-classes-iphone

![diagrama-classe-iphone](https://github.com/IvanConsalter/Project_SDS_Ds_Movie/assets/50461475/4f031986-2124-4513-8fa7-cb468d043459)

## Estrutura do Projeto

- `Telefone.java`: Define a interface `Telefone` com os métodos relacionados a chamadas telefônicas e acesso à lista de contatos.

- `ReprodutorMusica.java`: Define a interface `ReprodutorMusica` com os métodos para reprodução de músicas e acesso à lista de músicas.

- `NavegadorInternet.java`: Define a interface `NavegadorInternet` com os métodos para navegação na web e gerenciamento de histórico.

- `Dispositivo.java`: Implementa as três interfaces (`Telefone`, `ReprodutorMusica` e `NavegadorInternet`) em uma classe concreta `Dispositivo`. Esta classe mantém atributos como número de telefone, volume, página atual, lista de contatos e lista de músicas.

## Uso do Código

1. Clone o repositório para a sua máquina local.

2. Compile e execute o código Java, que inclui a classe `Dispositivo` para simular um dispositivo móvel que incorpora todas as funcionalidades mencionadas.

3. Você pode criar instâncias da classe `Dispositivo` e usar os métodos fornecidos pelas interfaces para fazer chamadas, reproduzir músicas, navegar na web, acessar listas de contatos e músicas, entre outras operações.

## Exemplo de Uso

```java
public class ExemploUso {
    public static void main(String[] args) {
        // Criar uma instância do Dispositivo
        Dispositivo meuDispositivo = new Dispositivo("123-456-7890");

        // Fazer uma chamada
        meuDispositivo.fazerChamada("987-654-3210");

        // Reproduzir uma música
        meuDispositivo.reproduzirMusica("Música 1");

        // Abrir uma página da web
        meuDispositivo.abrirPagina("https://www.exemplo.com");

        // Acessar a lista de contatos
        List<String> contatos = meuDispositivo.getListaDeContatos();

        // Acessar a lista de músicas
        List<String> musicas = meuDispositivo.getListaDeMusicas();
    }
}