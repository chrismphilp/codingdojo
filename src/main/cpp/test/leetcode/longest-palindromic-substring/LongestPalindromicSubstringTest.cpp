#include "LongestPalindromicSubstringTest.h"

TEST_F(LongestPalindromicSubstringTest, IsPalindromeShouldReturnTrueForPalindromicStrings) {
    ASSERT_TRUE(longestPalindromicSubstring.isPalindrome("a"));
    ASSERT_TRUE(longestPalindromicSubstring.isPalindrome("aa"));
    ASSERT_TRUE(longestPalindromicSubstring.isPalindrome("aba"));
    ASSERT_TRUE(longestPalindromicSubstring.isPalindrome("abcba"));
    ASSERT_TRUE(longestPalindromicSubstring.isPalindrome("aaaaa"));
    ASSERT_TRUE(longestPalindromicSubstring.isPalindrome("aaaaaa"));
}

TEST_F(LongestPalindromicSubstringTest, IsPalindromeShouldReturnFalseForNonPalindromicStrings) {
    ASSERT_FALSE(longestPalindromicSubstring.isPalindrome("ab"));
    ASSERT_FALSE(longestPalindromicSubstring.isPalindrome("abb"));
    ASSERT_FALSE(longestPalindromicSubstring.isPalindrome("aabba"));
    ASSERT_FALSE(longestPalindromicSubstring.isPalindrome("abab"));
    ASSERT_FALSE(longestPalindromicSubstring.isPalindrome("aaaaaab"));
    ASSERT_FALSE(longestPalindromicSubstring.isPalindrome("acbba"));
}

TEST_F(LongestPalindromicSubstringTest, EmptyStringShouldReturnAnEmptyString) {
    std::string s = "";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), s);
}

TEST_F(LongestPalindromicSubstringTest, SingleLengthStringShouldReturnASingleLengthString) {
    std::string s = "a";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), s);
}

TEST_F(LongestPalindromicSubstringTest, FullPalindromeStringShouldReturnSameString) {
    std::string s = "abcba";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), s);
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturnCorrectPalindromicSubstring) {
    std::string s = "abcdbab";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), "bab");
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturnSingleLengthString) {
    std::string s = "abcdef";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), "a");
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturnCorrectPalindromicStringForLongerString) {
    std::string s = "abcdbbfcba";
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), "bb");
}

TEST_F(LongestPalindromicSubstringTest, ShouldReturncorrectPalindromicStringForVeryLongString) {
    std::string s = "kyyrjtdplseovzwjkykrjwhxquwxsfsorjiumvxjhjmgeueafubtonhlerrgsgohfosqssmizcuqryqomsipovhhodpfyudtus"
                    "jhonlqabhxfahfcjqxyckycstcqwxvicwkjeuboerkmjshfgiglceycmycadpnvoeaurqatesivajoqdilynbcihnidbizwkua"
                    "oegmytopzdmvvoewvhebqzskseeubnretjgnmyjwwgcooytfojeuzcuyhsznbcaiqpwcyusyyywqmmvqzvvceylnuwcbxybhqp"
                    "vjumzomnabrjgcfaabqmiotlfojnyuolostmtacbwmwlqdfkbfikusuqtupdwdrjwqmuudbcvtpieiwteqbeyfyqejglmxofdj"
                    "ksqmzeugwvuniaxdrunyunnqpbnfbgqemvamaxuhjbyzqmhalrprhnindrkbopwbwsjeqrmyqipnqvjqzpjalqyfvaavyhytet"
                    "llzupxjwozdfpmjhjlrnitnjgapzrakcqahaqetwllaaiadalmxgvpawqpgecojxfvcgxsbrldktufdrogkogbltcezflyctkl"
                    "pqrjymqzyzmtlssnavzcquytcskcnjzzrytsvawkavzboncxlhqfiofuohehaygxidxsofhmhzygklliovnwqbwwiiyarxtoih"
                    "vjkdrzqsnmhdtdlpckuayhtfyirnhkrhbrwkdymjrjklonyggqnxhfvtkqxoicakzsxmgczpwhpkzcntkcwhkdkxvfnjbvjjou"
                    "mczjyvdgkfukfuldolqnauvoyhoheoqvpwoisniv";
    auto t1 = std::chrono::high_resolution_clock::now();
    ASSERT_EQ(longestPalindromicSubstring.longestPalindrome(s), "qahaq");
    auto t2 = std::chrono::high_resolution_clock::now();
    auto duration = std::chrono::duration_cast<std::chrono::milliseconds>( t2 - t1 ).count();
    ASSERT_LT(duration, 750);
}