package br.edu.ifsp.dmo1.lista_de_contatos.model

class Contact(val name: String, val phone: String): Comparable<Contact> {

    override  fun compareTo(other: Contact):Int{
        return name.compareTo(other.name)
    }
    override fun toString():String{
        return "Contato{name:'$name', phone:'$phone'}"
    }
}