package com.example.chmarax.logregform.Sports;

import com.example.chmarax.logregform.Sports.Adaptor.CardData;
import com.example.chmarax.logregform.Sports.Adaptor.Comment;
import com.example.chmarax.logregform.R;
import com.ramotion.expandingcollection.ECCardData;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SportsData {

    private List<ECCardData> dataset;

    public SportsData() {
        dataset = new ArrayList<>(5);

        CardData item5 = new CardData();
        item5.setMainBackgroundResource(R.drawable.attractions);
        item5.setHeadBackgroundResource(R.drawable.attractions_head);
        item5.setHeadTitle("AIR STRIKE");
        item5.setPersonMessage("RULE THE UNBOUND SKIES WITH THE RC FLYERS.");
        //item5.setPersonName("Marjorie Ellis");
        //item5.setPersonPictureResource(R.drawable.marjorie_ellis);
        item5.setListItems(prepareCommentsArray());
        dataset.add(item5);

        CardData item4 = new CardData();
        item4.setMainBackgroundResource(R.drawable.city_scape);
        item4.setHeadBackgroundResource(R.drawable.city_scape_head);
        item4.setHeadTitle("NIRMAN");
        item4.setPersonMessage("Ever get facinated by these excellent pieces of engineering and achitecture?" +
                " If yes, then lets bridge the gap between our knowledge and creativity and show the innovation and the engineer you have in you.");
        //item4.setPersonName("Mattew Jordan");
        //item4.setPersonPictureResource(R.drawable.mattew_jordan);
        item4.setListItems(prepareCommentsArray());
        dataset.add(item4);

        CardData item3 = new CardData();
        item3.setMainBackgroundResource(R.drawable.cuisine);
        item3.setHeadBackgroundResource(R.drawable.cuisine_head);
        item3.setHeadTitle("CHEMWIZZ");
        item3.setPersonMessage("Unleash the chem wizard inside you to the full potential and let your spell free, use to your logical ions to conduct yourself to the prize.");
        //item3.setPersonName("Ross Rodriguez");
        //item3.setPersonPictureResource(R.drawable.ross_rodriguez);
        item3.setListItems(prepareCommentsArray());
        dataset.add(item3);

        CardData item2 = new CardData();
        item2.setMainBackgroundResource(R.drawable.nature);
        item2.setHeadBackgroundResource(R.drawable.nature_head);
        item2.setHeadTitle("FUMES");
        //item2.setPersonName("Tina Caldwell");
        item2.setPersonMessage("Flying Machines facinates everyone, Don't they?" +
                " So interested in making one of those balancing flying machine models. This is your event people.");
        item2.setListItems(prepareCommentsArray());
        //item2.setPersonPictureResource(R.drawable.tina_caldwell);
        dataset.add(item2);

        CardData item1 = new CardData();
        item1.setMainBackgroundResource(R.drawable.night_life);
        item1.setHeadBackgroundResource(R.drawable.night_life_head);
        item1.setHeadTitle("SkYFALL");
        item1.setPersonMessage("Use the very basics of fluid mechanics principles and just make your Rocket fly.");
        //item1.setPersonName("Wallace Sutton");
        //item1.setPersonPictureResource(R.drawable.wallace_sutton);
        item1.setListItems(prepareCommentsArray());
        dataset.add(item1);

    }

    public List<ECCardData> getDataset() {
        //Collections.shuffle(dataset);
        return dataset;
    }

    private List<Comment> prepareCommentsArray() {
        //Random random = new Random();
        List<Comment> comments = new ArrayList<>();
        comments.addAll(Arrays.asList(
                new Comment(R.drawable.ic_person_circle_white_24dp, "Aniket Waliyan", "Mobile no : +917906283840", "jan 12, 2014"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Piyush Shukla", "Mobile no : +917906283840", "jun 1, 2015"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Vishnu Chauhan", "Mobile no : +917906283840", "sep 21, 1937"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Twinkle Katiyar", "Mobile no : +917906283840", "may 23, 1967"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Varkha yadav", "IMobile no : +917906283840", "sep 1, 1972"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Aditya Rai", "Mobile no : +917906283840", "aug 13, 1995"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Ayush Ranjan", "Mobile no : +917906283840", "nov 18, 1952"),
                new Comment(R.drawable.ic_person_circle_white_24dp, "Aashutosh Verma", "Mobile no : +917906283840", "apr 1, 2013")));
        //Collections.shuffle(comments);
        //return comments.subList(0, 6 + random.nextInt(5));
        return comments;
    }
}
