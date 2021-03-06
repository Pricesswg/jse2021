/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package esercizio4;

import java.util.Objects;

/**
 *
 * @author alfonso
 */
public class Voce {

    public static enum Tipologia {
        AMICIZIE, LAVORO, SPORT, MUSICA, FAMIGLIA
    }

    private final Tipologia t;
    private final String nome;

    public Voce(Tipologia t, String nome) {
        this.t = t;
        this.nome = nome;
    }

    public Tipologia getT() {
        return t;
    }

    public String getNome() {
        return nome;
    }

    @Override
    public int hashCode() {
        int hash = 5;
        hash = 73 * hash + Objects.hashCode(this.t);
        hash = 73 * hash + Objects.hashCode(this.nome);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Voce other = (Voce) obj;
        if (!Objects.equals(this.nome, other.nome)) {
            return false;
        }
        return this.t == other.t;
    }

    @Override
    public String toString() {
        return "Voce{" + "t=" + t + ", nome=" + nome + '}';
    }

}
