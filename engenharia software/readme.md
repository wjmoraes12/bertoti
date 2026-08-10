Atividade 1:
- As arquiteturas da Engenharia de Software diferem daquilo que conhecemos do mundo tangível. Ademais, conhecemos os engenheiros civis, aeronáuticos criando grandes protótipos, os quais todos os fatores correlatos ao seu
funcionamento devem estar perfeitos, pois podem e devem causar danos quando não utilizados corretamente. Além do fato, programadores e engenheiros de software, algumas vezes, acabam desempenhando algumas atividades similares,
incluindo o uso de programas pré-definidos. Então, o conceito de engenharia de software é um tema bastante relevante e que merece uma definição mais clara, uma vez que arquiteturas, trade-offs, estruturação dos dados são
decididos ora programador ora engenheiro de software. Isso implica que o trabalho teórico, matemática e estruturação sistêmica acaba sendo difundida em ambas as culturas de profissões. Por conseguinte, resulta-se numa
perspectiva que o detalhamento dessas profissões devem ser algo claro e tangível, devido ao fato de software ser algo crítico em quase todos os aspectos da sociedade: político, sociocultural, pessoal e econômico. Tudo envolve
o uso, desenvolvimento e uma regulamentação dos usos desses sistemas, com isso, fica-se claro que as regras devem ser cruciais para manter esses projetos, isto é, em estudos rigorosos para que o software seja previsível em
todos os seus aspectos.
- No entanto, acaba-se sendo um fator distante, uma vez que as regras de regulamentação não são tão claras, isto é, é difícil diferir um engenheiro de um programador. Logo, para sistemas mais previsíveis e robustos deve-se
possuir uma clara definição sobre a área de atuação de cada profissional, sendo que hodiernamente é totalmente comum, inclusive, visualizar pessoas empregadas na área sem mesmo nunca terem participado de um curso de
especialização.

Atividade 2:
- Uso de minha resposta acima para começar a responder esse trecho da seguinte maneira: softwares são, em grande parte do tempo, resoluções de problemas temporais, isto é, ocorrem mutações ao longo do tempo. Por isso, o
o software deve manter um planejamento contínuo, rigoroso e sistemático não apenas sobre código, mas sobre pessoas. Um código pode ser extremamente otimizado, banco bem orientado, microsserviços, rate limiter, edge layer,
proteções de endpoints, mas se não for algo replicável no cotidiano, torna-se algo sem utilidade. Por isso, decisões, custos e planejamento são as chaves de acordo com o Google.


Trade-Offs:

1. Usar um banco de dados NoSQL (ex: MongoDB) em vez de SQL (ex: PostgreSQL)
Escolho o MongoDB porque meu projeto precisa de grande flexibilidade no formato dos dados e crescimento rápido (escalabilidade horizontal). O trade-off é que perco a garantia forte de transações e integridade relacional que o PostgreSQL oferece — mas, para um catálogo de produtos de um e-commerce, essa perda não me afeta, devido aos usos de relacionamento entre tabelas.

2. Usar Python em vez de JavaScript (Node.js) para um script de automação
Escolho Python porque a sintaxe é mais legível e a biblioteca padrão já traz tudo o que preciso (manipulação de arquivos, requisições com requests). O trade-off é que a equipe principal do projeto programa em JavaScript, então haverá mais um contexto de linguagem para manter. Porém, para um script que roda apenas uma vez por dia e ninguém modifica com frequência, a simplicidade do Python vale mais que a padronização.

3. Usar Python em vez de C++ para desenvolver um protótipo
Escolho Python porque o desenvolvimento é muito mais rápido e tem bibliotecas prontas para quase tudo (IA, análise de dados, APIs). O trade-off é que o programa fica mais lento que uma versão equivalente em C++. Porém, para um MVP onde o tempo de lançamento importa mais que a performance máxima, vale a pena.
