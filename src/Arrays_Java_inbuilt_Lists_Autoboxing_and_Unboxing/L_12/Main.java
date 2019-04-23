package Arrays_Java_inbuilt_Lists_Autoboxing_and_Unboxing.L_12;

import java.util.*;

public class Main {
    private static List<Album> albums = new ArrayList<>();
    public static void main(String[] args) {

        Album album = new Album("Storm bringer","Deep Purple");
        album.addSong("Storm bringer",4.6);
        album.addSong("Love don't mean a thing",4.22);
        album.addSong("Holy man ",4.3);
        album.addSong("Hold on",5.6);
        album.addSong("Lady double dealer",3.21);
        album.addSong("You can do it right",6.23);
        album.addSong("High ball shooter",4.27);
        album.addSong("The gypsy",4.2);
        album.addSong("Soldier of fortune",3.13);
         albums.add(album);



            album = new Album("For those about to rock","AC/DC");
        album.addSong("For those about to rock",5.44);
        album.addSong("I put the finger on you ",3.25);
        album.addSong("Lets go ",3.45);
        album.addSong("Inject the venom",3.33);
        album.addSong("Snowballed",4.51);
        album.addSong("Evil walks",3.45);
        album.addSong("C.O.D",5.25);
        album.addSong("Breaking the rules ",5.32);
        album.addSong("Night of the long knifes",5.12);
        albums .add(album);


        List<Song> playList = new Vector<>();
        albums.get(0).addToPlaylist("You can do it right",playList);
        albums.get(0).addToPlaylist("Holy Man",playList);
        albums.get(0).addToPlaylist("Speed king",playList);
        albums.get(0).addToPlayList(9,playList);

        albums.get(1).addToPlayList(8,playList);
        albums.get(1).addToPlayList(3,playList);
        albums.get(1).addToPlayList(2,playList);
        albums.get(1).addToPlayList(24,playList);
        play(playList);
    }



    private static void play(List playList){
        Scanner scanner = new Scanner(System.in);
        boolean quit = false;
        boolean foward = true;
        ListIterator<Song> listIterator = playList.listIterator();
        if(playList.size() == 0){
            System.out.println("No songs in playList");
        }
        else{
            System.out.println("Now playing " + listIterator.next().toString());
            printMenu();
        }
        while(!quit){
            int action = scanner.nextInt();
            scanner.nextLine();
            switch (action){
                case 0:
                    System.out.println("Playlist complete");
                    break;
                case 1:
                    if(!foward){
                        if(listIterator.hasNext()){
                            listIterator.next();
                        }
                        foward = true;
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing" + listIterator.next().toString());
                    } else{
                        System.out.println("We have reached the end of the playlist");
                        foward = false;
                    }
                    break;

                    case 2:
                    if(foward){
                        if(listIterator.hasPrevious()){
                            listIterator.previous();
                        }
                        foward = false;
                    }
                    if(listIterator.hasPrevious()){
                        System.out.println("Now playing " +  listIterator.previous().toString());
                    }else{
                        System.out.println("We are the start of the playlist ");
                        foward = true;
                    }
                    break;

                    case 3:
                    if(foward){
                        if(listIterator.hasPrevious()){
                            System.out.println("Now  replaying " + listIterator.previous().toString());
                            foward = false;
                        } else{
                            System.out.println("Were at  the start on list ");
                        }
                    }else{
                        if(listIterator.hasNext()){
                            System.out.println("Now replaying " + listIterator.next().toString());
                           foward = true;
                        }else{
                            System.out.println("We have  reached the end of the list ");
                        }
                    }
                    break;
                case 4:
                    printList(playList);
                    break;

                    case 5:
                      printMenu();
                      break;
                case 6:
                    if(playList.size() > 0){
                            listIterator.remove();
                    }
                    if(listIterator.hasNext()){
                        System.out.println("Now playing " + listIterator.next());
                    }else if(listIterator.hasPrevious()){
                        System.out.println("Now playing " + listIterator.previous());
                    }
                    break;
            }
        }
    }

        private static  void printMenu(){
            System.out.println("Available actions  ");
            System.out.println("0 - to quit\n" +
                    "1 - to play next song\n" +
                    "2 - to play previous song\n" +
                    "3 - to replay the current song\n " +
                    "4 - list songs in the playlist\n" +
                    "5 - print available actions." +
                    "6 - delete current song from playlist ");
        }


        private static void printList(List playList){
            Iterator<Song> iterator = playList.iterator();
            System.out.println("=============================");
            while(iterator.hasNext()){
                System.out.println(iterator.next().toString());
            }
            System.out.println("===============================");
        }


}
