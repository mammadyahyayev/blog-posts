# Import Required Libraries
library(dplyr)
library(ggplot2)
library(tidyr)
library(readxl)

# Read from excel file
olympic_games <- read_excel("olympic_games.xlsx")

View(olympic_games)

olympic_games <- olympic_games %>% 
  fill(c(Region, Year), .direction="down")

olympic_games_by_region <- olympic_games %>% 
  distinct(Region, Year) %>% 
  group_by(Region) %>% 
  count()

View(olympic_games_by_region)

# Step 1
ggplot(data = olympic_games_by_region,
       aes(x="", y = n, fill = Region))


# Step 2
ggplot(data = olympic_games_by_region,
       aes(x="", y = n, fill = Region)) +
  geom_bar(stat = "identity", color = "white")


# Step 3
ggplot(data = olympic_games_by_region,
       aes(x="", y = n, fill = Region)) +
  geom_bar(stat = "identity", color = "white") +
  coord_polar("y")


# Step 4
ggplot(data = olympic_games_by_region,
       aes(x="", y = n, fill = Region)) +
  geom_bar(stat = "identity", color = "white") +
  coord_polar("y") +
  geom_text(aes(label = n),
            position = position_stack(vjust = 0.5),
            color="white",
            size=5)


# Step 5
ggplot(data = olympic_games_by_region,
             aes(x="", y = n, fill = Region)) +
  geom_bar(stat = "identity", color = "white") +
  coord_polar("y") +
  geom_text(aes(label = n),
            position = position_stack(vjust = 0.5),
            color="white",
            size=5) +
  labs(title = "The Olympic Games held by regions so far")

    