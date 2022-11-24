# Import Required Libraries
library(dplyr)
library(ggplot2)
library(tidyr)
library(readxl)

# Read from excel file
olympic_games <- read_excel("olympic_games.xlsx")

View(olympic_games)

olympic_games <- olympic_games %>%
  fill(c(Region, Year), .direction = "down")

olympic_games_by_region <- olympic_games %>%
  group_by(Region, Year) %>%
  summarize()

olympic_games_by_region_count <- olympic_games_by_region %>%
  group_by(Region) %>%
  count()

View(olympic_games_by_region_count)

ggplot(data = olympic_games_by_region_count,
             aes(x = "", y = n, fill = Region)) +
  geom_bar(stat = "identity", color = "white") +
  coord_polar("y") +
  geom_text(aes(label = n),
            position = position_stack(vjust = 0.5),
            color = "white",
            size = 5) +
  labs(title = "The Olympic Games held by regions so far")
