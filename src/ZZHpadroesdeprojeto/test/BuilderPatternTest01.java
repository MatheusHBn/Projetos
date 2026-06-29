package ZZHpadroesdeprojeto.test;

import ZZHpadroesdeprojeto.dominio.Person;

public class BuilderPatternTest01 {
    /*
    Opa, assunto novo, agora vamos falar sobre padrões de projeto. Vamos descobrir soluções de problemas que aparecem
    muito, e pode-se usar.

    Imagine que você tem vários atributos na sua classe( String nome; int idade; etc.), para passa-los para o construtor
    não é difícil, mas sem uma IDE que te fale qual o parâmetro que você tem que colocar, com muitos atributos fica bem
    difícil de ler e manter. E pra isso o Builder foi criado, em vez de passar tudo no construtor, você monta o objeto
    passo a passo, que desse jeito fica muito mais fácil de entender quais parâmetros estão sendo passados.

    E sempre passe o build() no final, pois sem ele, você ainda não criou um objeto, apenas guardou as informações, esse
    build() é quem cria o objeto em si. E ele também pode ser usado para validar se uma pessoa pode ser criada ou não,
    por meio de verificações(essas verificações você pode criar)
     */
    static void main() {
        new Person.PersonBuilder()
                .firstName("Matheus")
                .lastName("Nascimento")
                .userName("MatheusHBn")
                .email("matheushbn123@gmail.com")
                .build();
    }
}
