package main

import (
   "os"
   "text/template"
)

type Person struct {
   Name string
   Age  int
}

func main() {
   people := []Person{
      {
       Name: "Leonardo",
       Age:  50,
      },
      {
       Name: "Rose",
       Age:  25,
      },
   }
  
   var tmplFile = "keyvalue.tmpl"
   tmpl, err := template.New(tmplFile).ParseFiles(tmplFile)
   if err != nil {
      panic(err)
   }
   
   err = tmpl.Execute(os.Stdout, people)
   if err != nil {
      panic(err)
   }
}