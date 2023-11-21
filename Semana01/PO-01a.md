## Exercicio 4

Conceito de Herança em Java:
Herança é um conceito fundamental na programação orientada a objetos que permite a uma classe herdar características (membros e métodos) de outra classe. Em Java, uma classe pode estender (herdar de) outra classe usando a palavra-chave extends. A classe que é estendida é chamada de superclasse ou classe pai, e a classe que estende é chamada de subclasse ou classe filha.

Como Criar uma Subclasse em Java:
~~~java
// Superclasse
class Animal {
    void fazerSom() {
        System.out.println("Algum som genérico");
    }
}

// Subclasse
class Cachorro extends Animal {
    void fazerSom() {
        System.out.println("Latir");
    }
}
~~~
Paralelo em C++:
Em C++, a herança é alcançada usando a palavra-chave class com o modificador : public para especificar a relação de herança pública.

Exemplos em C++:
~~~cpp
#include <iostream>
using namespace std;

// Exemplo 1: Herança Simples
class Animal {
public:
    void fazerSom() {
        cout << "Algum som genérico" << endl;
    }
};

class Cachorro : public Animal {
public:
    void fazerSom() {
        cout << "Latir" << endl;
    }
};

// Exemplo 2: Herança Múltipla
class Veiculo {
public:
    void ligarMotor() {
        cout << "Motor ligado" << endl;
    }
};

class Carro : public Veiculo {
public:
    void acelerar() {
        cout << "Acelerando" << endl;
    }
};

// Exemplo 3: Herança Protegida
class Pessoa {
protected:
    string nome;
public:
    Pessoa(string n) : nome(n) {}
};

class Estudante : protected Pessoa {
public:
    Estudante(string n) : Pessoa(n) {}
    void exibirNome() {
        cout << "Nome: " << nome << endl;
    }
};

// Exemplo 4: Herança Privada
class Figura {
private:
    int lados;
public:
    Figura(int l) : lados(l) {}
    int getLados() {
        return lados;
    }
};

class Triangulo : private Figura {
public:
    Triangulo(int l) : Figura(l) {}
    int obterLados() {
        return getLados(); // Método privado da superclasse é acessado dentro da subclasse
    }
};

// Exemplo 5: Construtores e Destrutores na Herança
class Pai {
public:
    Pai() {
        cout << "Construtor Pai" << endl;
    }
    ~Pai() {
        cout << "Destrutor Pai" << endl;
    }
};

class Filho : public Pai {
public:
    Filho() {
        cout << "Construtor Filho" << endl;
    }
    ~Filho() {
        cout << "Destrutor Filho" << endl;
    }
};
~~~

Esses exemplos em C++ ilustram diferentes aspectos da herança, como herança simples, múltipla, protegida, privada, e o uso de construtores e destrutores na hierarquia de classes.

## Exercicio 5

Não é correto dizer que em Java, quando declaramos uma variável, estamos lidando com um ponteiro da mesma forma que em C++. Vamos esclarecer essa diferença:

Java:
Em Java, as variáveis de tipos primitivos (int, double, char, boolean, etc.) armazenam diretamente os valores, não referências ou ponteiros. As variáveis de tipos não primitivos (objetos) armazenam referências para os objetos na memória. No entanto, os detalhes de alocação de memória e manipulação de ponteiros são tratados automaticamente pelo gerenciamento de memória do Java, e os programadores geralmente não precisam se preocupar com a manipulação direta de ponteiros.
#### Java
~~~java
int numero = 42; // Tipo primitivo, armazena o valor diretamente
String texto = "Hello"; // Objeto, armazena uma referência para o objeto na memória
~~~

C++:
Em C++, as variáveis podem ser declaradas como tipos primitivos, que armazenam valores diretamente, ou como ponteiros, que armazenam endereços de memória. O uso de ponteiros em C++ permite manipular diretamente a memória, o que pode ser poderoso, mas também requer cuidado para evitar vazamentos de memória e erros.

#### Exemplo em C++:
~~~cpp

int numero = 42; // Tipo primitivo, armazena o valor diretamente
int* ponteiroNumero = &numero; // Ponteiro, armazena o endereço de memória

// Manipulação direta usando ponteiro
cout << "Valor através do ponteiro: " << *ponteiroNumero << endl;
~~~ 

Portanto, a principal diferença está na abstração fornecida pelas linguagens. Java abstrai muitos detalhes de gerenciamento de memória e ponteiros para fornecer mais segurança e simplicidade, enquanto em C++, você tem mais controle sobre a memória, mas também mais responsabilidade para gerenciar esses detalhes
