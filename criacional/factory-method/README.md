# Exemplo do Padrão Criacional Factory Method com Spring Framework
Este é um exemplo simples de implementação do padrão criacional Factory Method utilizando o Spring Framework. Neste exemplo, criaremos um sistema de geração de relatórios, onde diferentes tipos de relatórios (PDF e CSV) serão criados usando o Factory Method.

## Pré-requisitos
- Java 17 ou versão superior
- Maven
- Spring Boot

## Como Utilizar

Siga os passos abaixo para utilizar o exemplo:

1. Clone o repositório:
```bash
git clone https://github.com/Alexandregabriell/design-patterns.git
cd design-patterns
```
2. Execute o projeto usando o Maven:
```bash
mvn spring-boot:run
```
3. A saída será a geração do relatório em PDF e em CSV:
```css
Gerando relatório em PDF...

ou

Gerando relatório em CSV...
```

## Como Funciona
O exemplo utiliza o padrão Factory Method para criar e gerar diferentes tipos de relatórios, como PDF e CSV. O Factory Method é implementado através da interface ReportFactory, que possui uma implementação concreta para cada tipo de relatório (PDF e CSV).

O serviço ReportService é responsável por receber a implementação de ReportFactory via injeção de dependência do Spring e utilizar o Factory Method para criar o relatório apropriado. Dessa forma, a escolha entre PDF e CSV é feita através da configuração do Spring.

## Conclusão
Este exemplo demonstra como implementar o padrão criacional Factory Method com o Spring Framework para criar um sistema flexível e não acoplado, permitindo adicionar novos tipos de relatórios sem alterar o código existente. O Spring Framework facilita a configuração e a injeção de dependências, tornando a criação de sistemas modulares e de fácil manutenção.

Essa abordagem segue as boas práticas de SOLID, em especial o Princípio do Aberto/Fechado (OCP), permitindo que novos tipos de relatórios possam ser adicionados sem alterar o código existente, apenas criando novas classes de fábrica para os novos tipos de relatório. Além disso, o código também respeita o Princípio da Responsabilidade Única (SRP), mantendo cada classe focada em uma única responsabilidade.
