package br.edu.ifsp.dmo1.lista_de_contatos.model
import java.util.LinkedList
object ContactDao {
    private val dataset = LinkedList<Contact>()
    fun insert(contact: Contact) {
        dataset.add(Contact(contact.name, contact.phone))
    }
    fun findAll(): List<Contact> {
        return sort(ArrayList(dataset))
    }
    fun sort(lista: List<Contact>) : List<Contact>{
         return lista.sortedBy { it.name }
    }
}