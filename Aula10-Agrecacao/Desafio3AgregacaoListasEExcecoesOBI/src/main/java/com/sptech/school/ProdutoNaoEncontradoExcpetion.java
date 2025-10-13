package com.sptech.school;

//  Excessão personalizada: produto não encontrado
public class ProdutoNaoEncontradoExcpetion extends Exception {
    public ProdutoNaoEncontradoExcpetion(String message) {
        super(message);
    }
}
