package com.example.springbootmysqlkotlin.service

import com.example.springbootmysqlkotlin.model.Book
import com.example.springbootmysqlkotlin.model.request.BookCreationRequest
import com.example.springbootmysqlkotlin.repository.AuthorRepository
import com.example.springbootmysqlkotlin.repository.BookRepository
import com.example.springbootmysqlkotlin.repository.LendRepository
import com.example.springbootmysqlkotlin.repository.MemberRepository
import org.springframework.data.repository.findByIdOrNull
import org.springframework.stereotype.Service
import javax.persistence.EntityNotFoundException

@Service
class LibraryService(
    val authorRepository: AuthorRepository,
    val memberRepository: MemberRepository,
    val lendRepository: LendRepository,
    val bookRepository: BookRepository,
) {
    fun readBook(id: Long): Book {
        val book: Book? = bookRepository.findByIdOrNull(id)
        return book ?: throw EntityNotFoundException("Cant find any book under given ID")
    }

    fun createBook(book: BookCreationRequest){
        val author = authorRepository.findByIdOrNull(book.authorId) ?: throw EntityNotFoundException("Author Not Found");
//        val bookToCreate: Book = Book()
    }
}