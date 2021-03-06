package ro.ase.cts.prototype.clase;

	public class ContCient implements AbstractPrototype {
		private String nume;
		private int varsta;
		private int codClient;

		// realizam validari care vor consuma resurse
		public ContCient(String nume, int varsta, int codClient) {
			super();
			this.nume = nume;
			this.varsta = varsta;
			this.codClient = codClient;
		}

		@Override
		public String toString() {
			StringBuilder builder = new StringBuilder();
			builder.append("ContClient [nume=");
			builder.append(nume);
			builder.append(", varsta=");
			builder.append(varsta);
			builder.append(", codClient=");
			builder.append(codClient);
			builder.append("]");
			return builder.toString();
		}

		private ContCient() {
			super();
		}
		
		@Override
		public AbstractPrototype copiaza() {
			ContCient contClient= new ContCient();
			contClient.nume=this.nume;
			contClient.varsta=this.varsta;
			contClient.codClient=this.codClient;
			return contClient;
		}
}
