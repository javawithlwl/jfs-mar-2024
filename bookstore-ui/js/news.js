const idCountry = document.getElementById('idCountry');
const idCategory = document.getElementById('idCategory');
const apiKey = 'cfaf5fcdebfb4d7293720a9aa6ffc113';
const baseUrl = 'https://newsapi.org/v2/top-headlines';

idCountry.addEventListener('change', () => {
    getNewsHeadings();
});
idCategory.addEventListener('change', () => {
    getNewsHeadings();
});

function getNewsHeadings(){
   let country = idCountry.value;
   let category = idCategory.value;
   let url = baseUrl+'?country='+country+'&category='+category+'&apiKey='+apiKey;
   fetch(url).then(response => response.json())
   .then(data => {
         console.log(`Fetching news for ${country} and ${category}`);   
         console.log(data);
         showNewsHeadings(data);
    });   
}

function showNewsHeadings(data){
    let news = data.articles;
    let newsHtml = '';
    news.forEach((newsItem, index) => {
        newsHtml += `<div class="card">
        <img src=${newsItem.urlToImage} class="card-img-top" alt="...">
        <div class="card-body">
          <h5 class="card-title">${newsItem.title}</h5>
          <p class="card-text">${newsItem.description}</p>
          <a href=${newsItem.url} class="btn btn-primary">Go somewhere</a>
        </div>
      </div><br/>`;
    });
    document.getElementById('idNewsDetails').innerHTML = newsHtml;
}
getNewsHeadings();