package com.example.easyfood.data.entity

data class NewsResponse(
    val status: String,
    val totalResults: Int,
    val articles: List<Article>
)

data class  Article(
    val source: Source,
    val author: String?,
    val title: String,
    val description: String?,
    val url: String,
    val urlToImage: String?,
    val publishedAt: String,
    val content: String?
)
data class Source(
    val id: String?,
    val name: String
)
/*

"status": "ok",
  "totalResults": 10332,
  "articles": [
    {
      "source": {
        "id": null,
        "name": "Yahoo Entertainment"
      },
      "author": "Brian McGleenon",
      "title": "Bitcoin price holds above $102,000 as BlackRock leads fund inflows",
      "description": "Bitcoin traded relatively flat on Thursday as institutional investors resumed allocations into US-based spot bitcoin exchange-traded funds on Wednesday.",
      "url": "https://uk.finance.yahoo.com/news/bitcoin-price-blackrock-fund-inflows-083952678.html",
      "urlToImage": "https://s.yimg.com/ny/api/res/1.2/VccZ29AP5EbMUUA1Bt5b8A--/YXBwaWQ9aGlnaGxhbmRlcjt3PTEyMDA7aD03Njk-/https://s.yimg.com/os/creatr-uploaded-images/2024-03/1a844b70-e77d-11ee-afed-082fc5f5ad1b",
      "publishedAt": "2025-05-15T08:39:52Z",
      "content": "Bitcoin (BTC-USD) traded relatively flat on Thursday, priced just above $102,200 (£76,989) down around 1% on the day as institutional investors resumed allocations into US-based spot bitcoin exchange… [+2465 chars]"
    },
 */