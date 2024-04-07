/** *********
 *O que é um Package: Um package em Java é um agrupamento de classes e
 * interfaces relacionadas. Ele fornece um namespace para as classes contidas nele,
 * evitando conflitos de nomes e facilitando a organização do código.
 *
 * Estrutura de um Package: Um package é representado por um diretório no
 * sistema de arquivos. O nome do package é o caminho do diretório onde as
 * classes estão localizadas. Por exemplo, o package com.exemplo geralmente é
 * armazenado em um diretório chamado com/exemplo/.
 *
 * Declaração de um Package: Para declarar que uma classe pertence a um package
 * específico, usamos a declaração package no início do arquivo de código-fonte da
 * classe.
 */
package packages;

public class MinhaClasse {

    public void mostrarMensagem() {
        System.out.println("Olá do package com.exemplo!");
    }
}
