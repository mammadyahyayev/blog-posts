person <- c("Jack", "Rose", "Sam")
birthdates <- c("1999-03-01", "2000-12-23", "2000-09-20") # FORMAT: Year-Month-Day

class(birthdays)

people <- data.frame(name = person, birthdate = as.Date(birthdates))

class(people$birthdate)

birthdays <- as.Date(people$birthdate)

people <- data.frame(name = person, birthdate = birthdates)


people <- read.csv("people.csv")

people$birthdate = as.Date(people$birthdate)

people$birthdate = as.character(people$birthdate)

people$birthdate = format(people$birthdate, format="%d-%m-%Y")


# print current Date
print(Sys.Date())


# print current Date and Time
print(Sys.time())


# Date formats
print(format(Sys.Date(), format="%d")) # prints '08'

print(format(Sys.Date(), format="%A")) # prints 'Sunday'

print(format(Sys.Date(), format="%B")) # prints 'January'

print(format(Sys.Date(), format="%Y")) # prints '2023'

print(format(Sys.Date(), format="%B - %Y")) # prints 'January - 2023'


# time formats
print(format(Sys.time(), format="%H")) # prints '00'

print(format(Sys.time(), format="%M")) # prints '19'

print(format(Sys.time(), format="%X")) # prints '12:19:44 AM'

print(format(Sys.time(), format="%Z")) # prints '+04'


# current time in different cities
print(as.POSIXlt(Sys.time(), "Europe/Berlin"))

print(as.POSIXlt(Sys.time(), "Europe/Paris"))


# obtain all time and zones

tab <- file.path(R.home("share"), "zoneinfo", "zone1970.tab")
if(file.exists(tab)) {
  cols <- c("code", "coordinates", "TZ", "comments")
  tmp <- read.delim(file.path(R.home("share"), "zoneinfo", "zone1970.tab"),
                    header = FALSE, comment.char = "#", col.names = cols)
  if(interactive()) View(tmp)
  head(tmp, 10)
}



