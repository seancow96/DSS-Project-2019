// Generated by the protocol buffer compiler.  DO NOT EDIT!
// source: recommender.proto

package org.example.recommender;

public interface RecommendationsOrBuilder extends
    // @@protoc_insertion_point(interface_extends:recommender.Recommendations)
    com.google.protobuf.MessageOrBuilder {

  /**
   * <code>repeated .recommender.Movie movies = 1;</code>
   */
  java.util.List<org.example.recommender.Movie> 
      getMoviesList();
  /**
   * <code>repeated .recommender.Movie movies = 1;</code>
   */
  org.example.recommender.Movie getMovies(int index);
  /**
   * <code>repeated .recommender.Movie movies = 1;</code>
   */
  int getMoviesCount();
  /**
   * <code>repeated .recommender.Movie movies = 1;</code>
   */
  java.util.List<? extends org.example.recommender.MovieOrBuilder> 
      getMoviesOrBuilderList();
  /**
   * <code>repeated .recommender.Movie movies = 1;</code>
   */
  org.example.recommender.MovieOrBuilder getMoviesOrBuilder(
      int index);
}
