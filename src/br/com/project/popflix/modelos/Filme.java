package br.com.project.popflix.modelos;

import br.com.project.popflix.calculos.Classificavel;

public class Filme extends Titulo implements Classificavel {
        private String director;

        public Filme(String nome, int anoDeLamcamento) {
                super(nome, anoDeLamcamento);
        }

        public String getDirector() {
                return director;
        }

        public void setDirector(String director) {
                this.director = director;
        }

        @Override
        public int getClassificacao() {
                return (int) pegaMedia() / 2;
        }

        @Override
        public String toString() {
                return "Filme: " + this.getNome() + " (" + this.getAnoDeLancamento() + ")";
        }
}