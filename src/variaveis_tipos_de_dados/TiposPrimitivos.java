package variaveis_tipos_de_dados;

public class TiposPrimitivos {
	// var stringInferencia = ""; // O tipo é definido na atribuição

	// Tipos de dados inteiros:
	public byte byte_;//////// 8 bits | -128 a 127
	public short short_; //// 16 bits | -32.768 a 32.767
	public int int_; //////// 32 bits | -2.147.483.648 a 2.147.483.647
	public long long_; ////// 64 bits | -9.223.372.036.854.775.808 a 9.223.372.036.854.775.807

	public float float_;///// 32 bits | (+-)1.4E-45f a (+-)3.4028235E+38f
	public double double_;/// 64 bits | (+-)4.9E-324 a (+-)1.7976931348623157E+308

	public boolean bool_; ///// 1 bit | true ou false

	public char char_; ////// 16 bits | 'a', 'b', 'c', '1' ...

	public TiposPrimitivos(String a) {
		var var_ = a;
		/*
		 * Esse tipo tem seu tipo de acordo com o primeiro valor recebido; Precisa
		 * sempre receber um valor na declaração; Só pode ser declarados detro de
		 * métodos.
		 * 
		 */
	}

	public TiposPrimitivos(int a) {
		var var_ = a;
		/*
		 * Esse tipo tem seu tipo de acordo com o primeiro valor recebido; Precisa
		 * sempre receber um valor na declaração; Só pode ser declarados detro de
		 * métodos.
		 * 
		 */
	}

	public TiposPrimitivos(boolean a) {
		var var_ = a;
		/*
		 * Esse tipo tem seu tipo de acordo com o primeiro valor recebido; Precisa
		 * sempre receber um valor na declaração; Só pode ser declarados detro de
		 * métodos.
		 * 
		 */
	}

}
