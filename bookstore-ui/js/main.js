const idSerch = document.getElementById('idSearch');
const idBookDetails = document.getElementById('idBookDetails');
const idAddBook = document.getElementById('idAddBook');
const baseUrl = 'http://localhost:8080/api/v1/book';
function getBookDetails(){
    fetch(baseUrl+'/all')
    .then(response => response.json())
    .then(data => {
        books = data;
        console.log(books);
        showBookDetails(books);
    })
}
getBookDetails();
idSearch.addEventListener('keyup', () => {
    let searchValue = idSearch.value;
    fetch(baseUrl+'/search?str='+searchValue)
    .then(response => response.json())
    .then(data => {
        books = data;
        console.log(books);
        showBookDetails(books);
    });
});

idAddBook.addEventListener('click', () => {
    let title = document.getElementById('title').value;
    let author = document.getElementById('author').value;
    let price = document.getElementById('price').value;
    let category = document.getElementById('category').value;
    let description = document.getElementById('description').value;
    let book = {
        title: title,
        author: author,
        price: price,
        category: category,
        description: description
    };
    fetch(baseUrl, {
        method: 'POST',
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(book)
    }).then(response => {
        getBookDetails();
        clearForm()});

});

function clearForm(){
    document.getElementById('title').value = '';
    document.getElementById('author').value = '';
    document.getElementById('price').value = '';
    document.getElementById('category').value = '';
    document.getElementById('description').value = '';
}



function showBookDetails(bookList){
    // Add bootstrap table and display the book details idBookDetails
   
    if(bookList.length === 0){
        idBookDetails.innerHTML = `<p class='text-muted'>No books are found</p>`;
        return;
    }

    let table = document.createElement('table');
    table.classList.add('table');
    table.classList.add('table-striped');
    let thead = document.createElement('thead');
    let tr = document.createElement('tr');
    let th1 = document.createElement('th');
    th1.innerHTML = 'Title';
    let th2 = document.createElement('th');
    th2.innerHTML = 'Author';
    let th3 = document.createElement('th');
    th3.innerHTML = 'Price';
    let th4 = document.createElement('th');
    th4.innerHTML = 'Category';
    let th5 = document.createElement('th');
    th5.innerHTML = 'Description';
    tr.appendChild(th1);
    tr.appendChild(th2);
    tr.appendChild(th3);
    tr.appendChild(th4);
    tr.appendChild(th5);
    thead.appendChild(tr);
    table.appendChild(thead);
    let tbody = document.createElement('tbody');
    bookList.forEach(book => {
        let tr = document.createElement('tr');
        let td1 = document.createElement('td');
        td1.innerHTML = book.title;
        let td2 = document.createElement('td');
        td2.innerHTML = book.author;
        let td3 = document.createElement('td');
        td3.innerHTML = book.price;
        let td4 = document.createElement('td');
        td4.innerHTML = book.category;
        let td5 = document.createElement('td');
        td5.innerHTML = book.description;
        tr.appendChild(td1);
        tr.appendChild(td2);
        tr.appendChild(td3);
        tr.appendChild(td4);
        tr.appendChild(td5);
        tbody.appendChild(tr);
    });
    table.appendChild(tbody);
    idBookDetails.innerHTML = table.outerHTML;
}
