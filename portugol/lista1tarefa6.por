programa
{
	inclua biblioteca Matematica
	
	funcao inicio()
	{
		real d, x1, x2, y1, y2
          escreva("Digite o valor de x1: ")
          leia (x1)
 escreva("Digite o valor de x2: ")
          leia (x2)          
 escreva("Digite o valor de y1: ")
          leia (y1)
 escreva("Digite o valor de y2: ")
          leia (y2)
		d = Matematica.raiz((Matematica.potencia((x2-x1),2))+ (Matematica.potencia((y2-y1),2)),2) // (x2-x1) + (y2-y1) //potencia (numero, radical) 
          escreva("A distancia D é igual : " + Matematica.arredondar(d, 2)) //+d pq é o valor do resultado.
	}
}
/* $$$ Portugol Studio $$$ 
 * 
 * Esta seção do arquivo guarda informações do Portugol Studio.
 * Você pode apagá-la se estiver utilizando outro editor.
 * 
 * @POSICAO-CURSOR = 66; 
 * @PONTOS-DE-PARADA = ;
 * @SIMBOLOS-INSPECIONADOS = ;
 * @FILTRO-ARVORE-TIPOS-DE-DADO = inteiro, real, logico, cadeia, caracter, vazio;
 * @FILTRO-ARVORE-TIPOS-DE-SIMBOLO = variavel, vetor, matriz, funcao;
 */