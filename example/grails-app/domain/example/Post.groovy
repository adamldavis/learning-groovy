package example

class  Post  {
       String text
       int rating
       Date created = new  Date()
       User createdBy
   
       static hasMany = [comments: Comment]
   
       static constraints = {
           text(size:10..5000)
       }
}

