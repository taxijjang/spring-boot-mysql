package com.covenant.springbootmysql.controller;

import com.covenant.springbootmysql.model.Author;
import com.covenant.springbootmysql.model.Book;
import com.covenant.springbootmysql.model.Member;
import com.covenant.springbootmysql.model.request.AuthorCreationRequest;
import com.covenant.springbootmysql.model.request.BookCreationRequest;
import com.covenant.springbootmysql.model.request.MemberCreationRequest;
import com.covenant.springbootmysql.service.LibraryService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(value = "/api/library")
@RequiredArgsConstructor
public class LibraryController {
    private final LibraryService libraryService;

    @GetMapping("/book")
    public ResponseEntity readBooks(@RequestParam(required = false) String isbn) {
        if (isbn == null) {
            return ResponseEntity.ok(libraryService.readBooks());
        }
        return ResponseEntity.ok(libraryService.readBook(isbn));
    }

    @GetMapping("/book/{bookId}")
    public ResponseEntity<Book> readBook(@PathVariable Long bookId) {
        return ResponseEntity.ok(libraryService.readBook(bookId));
    }

    @PostMapping("/book")
    public ResponseEntity<Book> createBook(@RequestBody BookCreationRequest request) {
        return ResponseEntity.ok(libraryService.createBook(request));
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<Void> deleteBook(@PathVariable Long bookId) {
        libraryService.deleteBook(bookId);
        return ResponseEntity.ok().build();
    }

    @PostMapping("/member")
    public ResponseEntity<Member> createMember(@RequestBody MemberCreationRequest request) {
        return ResponseEntity.ok(libraryService.createMember(request));
    }

    @PatchMapping("/member/{memberId}")
    public ResponseEntity<Member> updateMember(@RequestBody MemberCreationRequest request, @PathVariable Long memberId) {
        return ResponseEntity.ok(libraryService.updateMember(memberId, request));
    }

    @PostMapping("/author")
    public ResponseEntity<Author> createAuthor(@RequestBody AuthorCreationRequest request) {
        return ResponseEntity.ok(libraryService.createAuthor(request));
    }
}
