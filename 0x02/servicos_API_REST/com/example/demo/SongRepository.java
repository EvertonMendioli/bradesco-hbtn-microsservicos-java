        @Repository
        public class SongRepository {
           
            
           
            public SongRepository() {
                Song s1 = new Song();
                s1.setId(1);
                s1.setNome("Bohemian Rhapsody");
                s1.setArtista("Queen");
                s1.setAlbum("A Night at the Opera");
                s1.setAnoLancamento("1975");
                list.add(s1);

                Song s2 = new Song();
                s2.setId(2);
                s2.setNome("Imagine");
                s2.setArtista("John Lennon");
                s2.setAlbum("Imagine");
                s2.setAnoLancamento("1971");
                list.add(s2);
                
            }

            private List<Song> list = new ArrayList<Song>();

           public List<Song> getAllSongs() {
            return list;
           }

           public Song getSongById(Integer id) {
                for (Song s : list) {
                    if(s.getId==id){
                        return s;
                    }
                }   
                return null;
           }

           public void addSong(Song s) {
                list.add(s);
           }

           public void updateSong(Song s) {
                list.remove(s);
                list.add(s);
        }

           public void removeSong(Song s) {
                list.remove(s);
        }
     }
